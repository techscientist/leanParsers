import java.util.ArrayList;

class RootModel {

	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String background_image;
	public String code_of_conduct;
	public int id;
	public String schedule_published_on;
	public String state;
	public String topic;
	public CreatorModel _creator;
	public String start_time;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String organizer_description;
	public VersionModel _version;
	public String timezone;
	public String name;
	public String end_time;
	public String description;
	public String logo;

	public RootModel(String privacy, ArrayList<Social_linksModel> social_links, String email, String background_image, String code_of_conduct, int id, String schedule_published_on, String state, String topic, CreatorModel creator, String start_time, String organizer_name, CopyrightModel copyright, String location_name, Call_for_papersModel call_for_papers, String type, String organizer_description, VersionModel version, String timezone, String name, String end_time, String description, String logo) {

		this.privacy = privacy;
		this.social_links = social_links;
		this.email = email;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.topic = topic;
		this._creator = creator;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.organizer_description = organizer_description;
		this._version = version;
		this.timezone = timezone;
		this.name = name;
		this.end_time = end_time;
		this.description = description;
		this.logo = logo;

	}

}