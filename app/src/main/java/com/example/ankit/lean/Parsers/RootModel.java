import java.util.ArrayList;

class RootModel {

	public String topic;
	public String timezone;
	public CreatorModel _creator;
	public String email;
	public String location_name;
	public String privacy;
	public String schedule_published_on;
	public VersionModel _version;
	public int id;
	public String name;
	public String organizer_description;
	public String description;
	public String start_time;
	public CopyrightModel _copyright;
	public String logo;
	public String state;
	public String type;
	public String end_time;
	public String background_image;
	public String code_of_conduct;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String topic, String timezone, CreatorModel creator, String email, String location_name, String privacy, String schedule_published_on, VersionModel version, int id, String name, String organizer_description, String description, String start_time, CopyrightModel copyright, String logo, String state, String type, String end_time, String background_image, String code_of_conduct, String organizer_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links) {

		this.topic = topic;
		this.timezone = timezone;
		this._creator = creator;
		this.email = email;
		this.location_name = location_name;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.id = id;
		this.name = name;
		this.organizer_description = organizer_description;
		this.description = description;
		this.start_time = start_time;
		this._copyright = copyright;
		this.logo = logo;
		this.state = state;
		this.type = type;
		this.end_time = end_time;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;

	}

}