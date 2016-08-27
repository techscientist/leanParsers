import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String logo;
	public String start_time;
	public String timezone;
	public String code_of_conduct;
	public String schedule_published_on;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public int id;
	public String state;
	public VersionModel _version;
	public String description;
	public String privacy;
	public String organizer_description;
	public String name;
	public String topic;
	public String end_time;
	public String email;
	public String type;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String location_name, String logo, String start_time, String timezone, String code_of_conduct, String schedule_published_on, CreatorModel creator, CopyrightModel copyright, String organizer_name, Call_for_papersModel call_for_papers, String background_image, int id, String state, VersionModel version, String description, String privacy, String organizer_description, String name, String topic, String end_time, String email, String type, ArrayList<Social_linksModel> social_links) {

		this.location_name = location_name;
		this.logo = logo;
		this.start_time = start_time;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.id = id;
		this.state = state;
		this._version = version;
		this.description = description;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.name = name;
		this.topic = topic;
		this.end_time = end_time;
		this.email = email;
		this.type = type;
		this.social_links = social_links;

	}

}