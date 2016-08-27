import java.util.ArrayList;

class RootModel {

	public String state;
	public String end_time;
	public String location_name;
	public String description;
	public String timezone;
	public String email;
	public String organizer_name;
	public String logo;
	public String schedule_published_on;
	public int id;
	public VersionModel _version;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String privacy;
	public CreatorModel _creator;
	public String background_image;
	public String topic;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String name;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String state, String end_time, String location_name, String description, String timezone, String email, String organizer_name, String logo, String schedule_published_on, int id, VersionModel version, String organizer_description, CopyrightModel copyright, String code_of_conduct, String privacy, CreatorModel creator, String background_image, String topic, String type, Call_for_papersModel call_for_papers, String start_time, String name, ArrayList<Social_linksModel> social_links) {

		this.state = state;
		this.end_time = end_time;
		this.location_name = location_name;
		this.description = description;
		this.timezone = timezone;
		this.email = email;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._version = version;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._creator = creator;
		this.background_image = background_image;
		this.topic = topic;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.name = name;
		this.social_links = social_links;

	}

}