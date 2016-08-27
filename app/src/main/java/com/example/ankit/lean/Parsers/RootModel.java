import java.util.ArrayList;

class RootModel {

	public String description;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String location_name;
	public CopyrightModel _copyright;
	public String email;
	public String timezone;
	public VersionModel _version;
	public String schedule_published_on;
	public String start_time;
	public String logo;
	public String organizer_description;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String organizer_name;
	public String name;
	public String background_image;
	public String type;
	public int id;
	public String privacy;
	public String end_time;
	public String topic;

	public RootModel(String description, Call_for_papersModel call_for_papers, CreatorModel creator, String location_name, CopyrightModel copyright, String email, String timezone, VersionModel version, String schedule_published_on, String start_time, String logo, String organizer_description, String code_of_conduct, ArrayList<Social_linksModel> social_links, String state, String organizer_name, String name, String background_image, String type, int id, String privacy, String end_time, String topic) {

		this.description = description;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.location_name = location_name;
		this._copyright = copyright;
		this.email = email;
		this.timezone = timezone;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.state = state;
		this.organizer_name = organizer_name;
		this.name = name;
		this.background_image = background_image;
		this.type = type;
		this.id = id;
		this.privacy = privacy;
		this.end_time = end_time;
		this.topic = topic;

	}

}