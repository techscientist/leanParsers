import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String organizer_name;
	public String schedule_published_on;
	public String topic;
	public String type;
	public String start_time;
	public int id;
	public String logo;
	public CopyrightModel _copyright;
	public String description;
	public String code_of_conduct;
	public String state;
	public CreatorModel _creator;
	public String background_image;
	public String timezone;
	public String location_name;
	public String end_time;
	public String email;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String privacy, String organizer_name, String schedule_published_on, String topic, String type, String start_time, int id, String logo, CopyrightModel copyright, String description, String code_of_conduct, String state, CreatorModel creator, String background_image, String timezone, String location_name, String end_time, String email, String organizer_description, Call_for_papersModel call_for_papers, String name, VersionModel version, ArrayList<Social_linksModel> social_links) {

		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.type = type;
		this.start_time = start_time;
		this.id = id;
		this.logo = logo;
		this._copyright = copyright;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._creator = creator;
		this.background_image = background_image;
		this.timezone = timezone;
		this.location_name = location_name;
		this.end_time = end_time;
		this.email = email;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this._version = version;
		this.social_links = social_links;

	}

}